var table = document.querySelector('#shoppingList');
var input = document.querySelector('input');
var button = document.querySelector('button');

button.onclick = addItem;
input.addEventListener("keyup", event => {
    if(event.key !== "Enter") return;
    button.click();
    event.preventDefault();
});

function addItem() {
    var inputValue = input.value;
    input.value = '';
    table.className = "table is-striped";

    var tableRow = document.createElement('tr');
    var tableColumn = document.createElement('td');
    tableColumn.textContent = inputValue;
    var tableColumn2 = document.createElement('td');
    var listBtn = document.createElement('button');
    listBtn.textContent = "DELETE"
    listBtn.className += " button is-danger is-small";

    
    table.appendChild(tableRow);
    tableRow.appendChild(tableColumn);
    tableRow.appendChild(tableColumn2);
    tableColumn2.appendChild(listBtn);

    listBtn.onclick = function(e) {
        table.removeChild(tableRow);
        if (table.childElementCount == 1) {
            table.className += " is-hidden"
        }
    }

    input.focus();
    
}