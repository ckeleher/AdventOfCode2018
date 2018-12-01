def i=0
def freqList = []
def dupFound = false

while(!dupFound){
    new File('inputs.txt').eachLine { line -> 
        if(freqList.contains(i)){
            println i
            dupFound=true
        }
        freqList.add(i)
        i+=line.toInteger()
    }
}
