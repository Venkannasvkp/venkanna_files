import React, { useState, useEffect } from 'react';
 const ItemForm = ({ fetchItems, editingItem, setEditingItem }) => {
  const [id, setId] = useState('');
  const [category, setCategory] = useState('');
  const [expiry, setExpiry] = useState('');
  const [name, setName] = useState('');
  const [price, setPrice] = useState('');
  const [manufacturingdate, setManufacturingdate] = useState('');
  
  useEffect(() => {
    if (editingItem) {
      setId(editingItem.id);
      setCategory(editingItem.category);
      setExpiry(editingItem.expiry);
      setName(editingItem.name);
      setPrice(editingItem.price);
      setManufacturingdate(editingItem.manufacturingdate);
    }
  }, [editingItem]);

  const handleSubmit = async (e) => {
    e.preventDefault();
    const item = { 
      id: Number(id),     
      category, 
      expiry, 
      name, 
      price: parseFloat(price), // Ensure price is a float
      manufacturingdate 
    };

    if (editingItem) {
      // Update item
      await fetch('http://localhost:8080/updateitem', {
        method: 'PUT',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(item),
      });
    } else {
      // Add new item
      await fetch('http://localhost:8080/additem', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(item),
      });
    
    }

    fetchItems();
    setEditingItem(null);
    setId('');
    setCategory('');
    setExpiry('');
    setName('');
    setPrice('');
    setManufacturingdate('');
  };

  return (
    <div className="form-container">
      <h2>{editingItem ? 'Edit Item' : 'Add Item'}</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          value={id}
          onChange={(e) => setId(e.target.value)}
          placeholder="Item ID"
          required
          disabled={editingItem}
        />
        <input
          type="text"
          value={category}
          onChange={(e) => setCategory(e.target.value)}
          placeholder="Category"
          required
        />
        <input
          type="localdate"
          value={expiry}
          onChange={(e) => setExpiry(e.target.value)}
          placeholder="Expiry Date"
          required
        />
        <input
          type="text"
          value={name}
          onChange={(e) => setName(e.target.value)}
          placeholder="Item Name"
          required
         />
        <input
          type="number"
          step="0.01"
          value={price}
          onChange={(e) => setPrice(e.target.value)}
          placeholder="Price"
          required
         />
         <input
          type="localdate"
          value={manufacturingdate}
          onChange={(e) => setManufacturingdate(e.target.value)}
          placeholder="Manufacturing Date"
          required
        />
        <button type="submit">{editingItem ? 'Update Item' : 'Add Item'}</button>
      </form>
    </div>
  );
};
export default ItemForm;

