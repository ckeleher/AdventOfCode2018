def i=0
new File('inputs.txt').eachLine { line -> i+=line.toInteger() }
println i