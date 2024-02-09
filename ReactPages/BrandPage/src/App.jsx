import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import NavBar from './components/NavBar'
import HeroSection from '../../project1/React-10-Projects/project-1/src/components/Hero'

function App() {
  return (
   <div>
    <NavBar />
    <HeroSection />
   </div>
  )
}

export default App
