Eep
===

Scala ports of a few examples from the
[jMonkeyEngine wiki](http://jmonkeyengine.org/wiki/doku.php/jme3#tutorials_for_beginners)
showing how to create basic game applocations using [jMonkeyEngine 3](http://jmonkeyengine.org/).

Installation
------------

1. Download and install [Scala](http://www.scala-lang.org/) if you don't have it already.

2. Download and install [simple-build-tool](http://code.google.com/p/simple-build-tool/) if you
don't have it already.

3. Check out this project: ``git clone git://github.com/mcroydon/eep.git``

4. Download [the binary distribution of jMonkeyEngine3](http://jmonkeyengine.org/wiki/doku.php#installation)
and place ``jMonkeyEngine3.jar`` and everything in ``lib`` in this project's ``lib`` directory.

5. Run ``sbt compile run``.

If everything goes well the examples will be compiled and you will be asked which
example application you would like to run:

    Multiple main classes detected, select one to run:
    
    [1] com.postneo.eep.HelloSimpleApplication
    [2] com.postneo.eep.HelloNode

The examples themselves are found in the directory ``src/main/scala/com/postneo/eep``.

License
-------

These examples are derived from [the jMonkeyEngine wiki](http://jmonkeyengine.org/wiki/doku.php)
and are released under the [Attribution 3.0 Unported](http://creativecommons.org/licenses/by/3.0/)
licensed.
