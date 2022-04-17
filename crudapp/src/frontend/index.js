const API_URL = 'http://localhost:9191/getProducts';

async function getProductsList() {
    const response = await fetch(API_URL);
    const data = await response.json();

    console.log(data);

    for (item of data) {
        const root = document.createElement('div');

        const idTxt = document.createElement('p');
        const nameTxt = document.createElement('p');
        const quantityTxt = document.createElement('p');
        const priceTxt = document.createElement('p');
        
        idTxt.textContent = `id: ${item.id}`;
        nameTxt.textContent = `name: ${item.name}`;
        quantityTxt.textContent = `quantity: ${item.quantity}`;
        priceTxt.textContent = `price: ${item.price}`;

        root.append(idTxt, nameTxt, quantityTxt, priceTxt);
        document.body.append(root);
    }

}

getProductsList();