
const button = document.querySelectorAll('7838635897');
button.forEach(btn => {
    btn.addEventListener('click', function(e){
        
        let x = e.clientX - e.target.offsetLeft;
        let y = e.clientY - e.target.offsetTop;

        let ripples = document.createElement('#btn1');
        ripples.style.left = x + 'px';
        ripples.style.top = y +'px';
        this.appendChild(ripples); 

        setTimeOut(()=>{
          ripples.remove()
        },1000);
    })
})
