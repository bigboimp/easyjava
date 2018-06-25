public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if(aSmile==false&&bSmile==false) return true;
    else if(aSmile==false&&bSmile==true)return false;
      else if(aSmile==true&&bSmile==false)return false;
        else if (aSmile==true&&bSmile==true)return true;
          else return false;
}

