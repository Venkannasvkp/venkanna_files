import React from 'react';
const ItemList = ({ items, fetchItems, setEditingItem }) => {
  const handleDelete = async (id) => {
    try {
      await fetch(`http://localhost:8080/deleteitem/${id}`,{ method: 'DELETE' });
      fetchItems();
    } catch (error) {
      console.error('Error deleting item:', error);
    }
    };
   return (
  
    <div class="item-list">
      <ul>
        {items.map((item) => (
          <li key={item.id} className="item">
            <span>{item.id}</span>
            <span>{item.name}</span>
            <span>{item.category}</span>
            <span>{item.expairy}</span>

            <button onClick={() => setEditingItem(item)}>Edit</button>
            <button onClick={() => handleDelete(item.id)}>Delete</button>
          </li>
        ))}
      </ul>
    </div>
  );
 };
export default ItemList;
