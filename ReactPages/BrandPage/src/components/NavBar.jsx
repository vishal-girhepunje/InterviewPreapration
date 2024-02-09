const NavBar =()=>{
    return(
        <nav className="container">
            <div className="logo">
                <img src="/images/brand_logo" alt="logo" />
            </div>
            <ul>
                <li href="#">Menu</li>
                <li href="#">Location</li>
                <li href="#">About</li>
                <li href="#">Contact</li>
            </ul>

            <button>login</button>

        </nav>
    );
};
export default NavBar;