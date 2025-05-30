let livroAtual = null;

function buscarLivro() {
  const isbn = document.getElementById('isbnInput').value;
  fetch(`https://brasilapi.com.br/api/isbn/v1/${isbn}`)
    .then(res => {
      if (!res.ok) throw new Error("Livro não encontrado.");
      return res.json();
    })
    .then(data => {
      livroAtual = data;
      const infoDiv = document.getElementById('bookInfo');
      infoDiv.innerHTML = `
        <h3>${data.title}</h3>
        ${data.subtitle ? `<p><strong>Subtítulo:</strong> ${data.subtitle}</p>` : ''}
        <p><strong>Autores:</strong> ${data.authors?.join(', ')}</p>
        <p><strong>Editora:</strong> ${data.publisher}</p>
        <p><strong>Sinopse:</strong> ${data.synopsis}</p>
        <p><strong>Ano:</strong> ${data.year}</p>
        <p><strong>Páginas:</strong> ${data.page_count}</p>
        <p><strong>Categoria:</strong> ${data.subjects?.join(', ')}</p>
        ${data.cover_url ? `<img src="${data.cover_url}" alt="Capa do Livro">` : ''}
      `;
      infoDiv.style.display = 'block';
      document.getElementById('salvarBtn').style.display = 'inline-block';
    })
    .catch(err => {
      alert("Erro: " + err.message);
      document.getElementById('bookInfo').style.display = 'none';
      document.getElementById('salvarBtn').style.display = 'none';
    });
}

function salvarLivro() {
  if (!livroAtual) return;
  const lista = document.getElementById('listaLivros');
  const item = document.createElement('li');
  item.textContent = `${livroAtual.title} (${livroAtual.year})`;
  lista.appendChild(item);
  livroAtual = null;
  document.getElementById('bookInfo').style.display = 'none';
  document.getElementById('salvarBtn').style.display = 'none';
  document.getElementById('isbnInput').value = '';
}