import React, { useState, useEffect } from 'react';
import './App.css';
import ItemForm from './components/ItemForm';
import ItemList from './components/ItemList';

const App = () => {
  const [items, setItems] = useState([]);
  const [editingItem, setEditingItem] = useState(null);

  useEffect(() => {
    fetchItems();
  }, []);

  const fetchItems = async () => {
    try {
      const response = await fetch('http://localhost:8080/getitem');
      const data = await response.json();
      
      if (Array.isArray(data)) {
        setItems(data); // Ensure data is an array
      } else {
        setItems([]);
        console.error("Expected an array but got:", data);
      }
    } catch (error) {
      console.error('Error fetching items:', error);
      setItems([]);
    }
  };

  return (
    <div className="App">
      <h1>Item Management</h1>
      <ItemForm
        fetchItems={fetchItems}
        editingItem={editingItem}
        setEditingItem={setEditingItem}
      />
      <ItemList
        items={items}
        fetchItems={fetchItems}
        setEditingItem={setEditingItem}
      />
    </div>
  );
};

export default App;
