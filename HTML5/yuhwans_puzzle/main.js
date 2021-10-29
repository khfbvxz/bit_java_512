// console.log("hello");
// document.cookie = "safeCookie1=foo; SameSite=Lax"; document.cookie = "safeCookie2=foo"; document.cookie = "crossCookie=bar; SameSite=None; Secure";
// document.cookie = "user=John"; 

const container = document.querySelector(".image-container")
const startButton = document.querySelector(".start-button")
const gameText = document.querySelector(".game-text")
const playTime = document.querySelector(".play-time")
const cheatButton = document.querySelector(".cheat.button")
// 16 개 반복문 사용

const tileCount = 16;
let tiles = [];

const dragged = {
  el : null,
  class : null,
  index : null, 
}
let isPlaying = false ; 
let timeInterval = null;
let time = 0;

// setGame();
function checkStatus(){
  const currentList = [...container.children];
  const unMatchedList = currentList.filter((child,index) => Number(child.getAttribute("data-index")) !== index)
  console.log(unMatchedList);

  if(unMatchedList.length === 0){
    //game 끝
    gameText.style.display = "block";
    isPlaying = false;
    clearInterval(timeInterval)
  }
}

function setGame(){
  isPlaying = true;
  time=0;
  container.innerHTML="";
  gameText.style.display = "none";
  timeInterval = setInterval(() => {
    playTime.innerHTML = time;
    time++;
  }, 1000)


  tiles = createImageTiles();
  tiles.forEach(tile => container.appendChild(tile))
  setTimeout(()=>{
    container.innerHTML="";
    shuffle(tiles).forEach(tile => container.appendChild(tile))
  }, 4000)
  
}

function createImageTiles(){
  const tempArray = [];
  Array(tileCount).fill().forEach ((_, i)=>{ 
    const li = document.createElement("li");
    li.setAttribute('data-index', i);
    li.setAttribute('draggable','true');
    li.classList.add("list"+i);
    //템플릿 문법 사용
    // li.classList.add('list${i}');
    // container.appendChild(li)
    tempArray.push(li);
    // container.appendChild(li)
  })
  return tempArray;
}

function shuffle(array){
  
  let index = array.length -1;
  while(index > 0){
    const randomIndex = Math.floor ( Math.random()*(index + 1));   // 랜덤  
    [array[index], array[randomIndex]] = [array[randomIndex], array[index]]  // 스위칭
    index--;
  }
  return array;
}


//event 
container.addEventListener('dragstart' , e => {
  if(!isPlaying) return;
  const obj = e.target
  // console.log(e)  // f12 target
  // 다른 곳에 놓았을 떄 이미지 바꾸어 주는 
  dragged.el = obj;
  dragged.class = obj.className;
  console.log(typeof e.target.parentNode.children)
  dragged.index = [...obj.parentNode.children].indexOf(obj);
})

container.addEventListener('dragover', e => {
  e.preventDefault()// 이벤트가 발생하지 않도록 
})
container.addEventListener('drop', e => {
  if(!isPlaying) return;
  // console.log('dropped')
  const obj = e.target;
  if(obj.className !== dragged.class){
    console.log("drop")
    let originPlace;
    let isLast = false;
    // console.log("3")
    if(dragged.el.nextSibling){
      // console.log("1")
      originPlace = dragged.el.nextSibling
    } else {
      // console.log("2")
      originPlace = dragged.el.previousSibling
      isLast = true;
    }
    const droppedIndex =  [...obj.parentNode.children].indexOf(obj);
    dragged.index > droppedIndex ? obj.before(dragged.el) : obj.after(dragged.el)
    isLast ? originPlace.after(obj) : originPlace.before(obj)
  }
  checkStatus();
})

startButton.addEventListener('click' , () => {
  setGame();
})
// setGame();

// tiles = createImageTiles();
// console.log(tiles)
// shuffle(tiles).forEach(tile=>container.appendChild(tile))
// 리듀스 맵 하이어 어레이?        _ 값 넣는 자리 없으니 _ 

// Array(tileCount).fill().forEach ( (_, i)=>{ 
//   const li = document.createElement("li");
//   li.setAttribute('data-index',i)
//   // li.classList.add("list"+i)
//   //템플릿 문법 사용
//   li.classList.add('list${i}');
//   container.appendChild(li)
//   // tempArray.push(li)
//   // container.appendChild(li)
// })