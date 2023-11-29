build_classes:
	mkdir -p build
	
	javac src/*.java -d build
	

run:
	java Main

clean:
	rm -f build/*class

start:
	make build_classes
	java Main

archive:
	mkdir -p build
	javac src/*.java -d build -encoding utf-8
	jar cf Morpion.jar -C build/ .

archivestart:
	java -cp "Morpion.jar" Main
