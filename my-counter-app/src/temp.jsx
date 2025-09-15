import { usestate } from 'react'
import './App.css'


function Count(){
    const [count, setCount]=usestate(0)
    return(div className="App">
        <h2>Counter:{Count}</h2>
        button onClick={()=>setCount(count+1)}Increment</button>
        <.div>)
        

export default Count;
    }