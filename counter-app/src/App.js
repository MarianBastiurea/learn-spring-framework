import './App.css';
import Counter from './counter/Counter'

function App() {
  return (
    <div className="App">
      <Counter by={1}/>
      <Counter by={2}/>
      <Counter by={5}/>
    </div>
  )
}
export default App;