# PaDEL-descriptor-ws

This web app implements a web server to compute PaDEL descriptors in a more efficient way in the framework of [eTOXlab](https://github.com/phi-grib/eTOXlab) and [eTOX project](http://www.etoxproject.eu/)

[PaDEL decriptors web site](http://www.yapcwsoft.com/dd/padeldescriptor/)

[PaDEL decriptors paper](https://www.ncbi.nlm.nih.gov/pubmed/21425294)

In the latest version 2.21 (21/07/2014). The software currently calculates 1875 descriptors (1444 1D, 2D descriptors and 431 3D descriptors) and 12 types of fingerprints (total 16092 bits).

eTOXlab is a modelling framework to develop and deploy QSAR models in production environments. 
One of the major goals of eTOXlab is the robustness of the platform.

To acomplish this goal the eTOXlab pipeline processess molecules individually.
But this has a major performance penalty when computing PaDEL descriptors due to PaDEL commandline mode startup delay and JVM startup delay.

The web server maintains a in-memory ready PaDEL descriptor computation engine. By calling the web server we can compute descriptors for the molecules needed without the need to reload PaDEL engine for every individual molecule.

We can measure de difference in computation time:

Molecule | Computation method | Computation time 
---------|--------------------|-------------------
[mol1](https://github.com/phi-grib/PaDEL-descriptor-ws/blob/master/input/individual/mol1/mol1.sdf)| PaDEL command-line|time ./test_cl_single_molecule.sh <br> real	0m2.487s <br> user	0m5.606s  <br> sys	0m0.442s <br> 
[mol1](https://github.com/phi-grib/PaDEL-descriptor-ws/blob/master/input/individual/mol1/mol1.sdf)| PaDEL ws descriptors engine|time ./test_ws_single_molecule.sh <br> real	0m0.260s  <br> user	0m0.005s <br> sys	0m0.015s 
[Set of 141 molecules](https://github.com/phi-grib/PaDEL-descriptor-ws/tree/master/input/individual)| PaDEL command-line
[Set of 141 molecules](https://github.com/phi-grib/PaDEL-descriptor-ws/tree/master/input/individual)| PaDEL ws descriptors engine|time ./test_ws_folders.sh <br> real	0m52.643s <br> user	0m0.398s <br> sys	0m0.946s 









