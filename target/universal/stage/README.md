# PaDEL ws descriptors engine

This web app implements a web server to compute PaDEL descriptors in a more efficient way in the framework of [eTOXlab](https://github.com/phi-grib/eTOXlab) and [eTOX project](http://www.etoxproject.eu/)

[PaDEL decriptors web site](http://www.yapcwsoft.com/dd/padeldescriptor/)

[PaDEL decriptors paper](https://www.ncbi.nlm.nih.gov/pubmed/21425294)

In the latest version 2.21 (21/07/2014). The software currently calculates 1875 descriptors (1444 1D, 2D descriptors and 431 3D descriptors) and 12 types of fingerprints (total 16092 bits).

eTOXlab is a modelling framework to develop and deploy QSAR models in production environments. 
One of the major goals of eTOXlab is the robustness of the platform.

To acomplish this goal the eTOXlab pipeline processess molecules individually.
But this has a major performance penalty when computing PaDEL descriptors due to PaDEL commandline mode startup delay and JVM startup delay.

So we developed the PaDEL ws descriptors engine that maintains a in-memory ready PaDEL descriptor computation engine. 

By calling the web server we can compute descriptors for the molecules needed without the need to reload PaDEL engine for every individual molecule.

In the current implementation the input molecules must be located in a local folder of the PaDEL ws descriptors engine. The ouput files containing the descriptors computed are also stored locally in the web server. A possible improvement is to provide an upload molecule mechanism

We can measure de difference in computation time.

Using the original PaDEL commnd-line interface:

Molecule | Computation method | Computation time 
---------|--------------------|-------------------
[mol1](https://github.com/phi-grib/PaDEL-descriptor-ws/blob/master/input/individual/mol1/mol1.sdf)| PaDEL command-line|time ./test_cl_single_molecule.sh <br> real	0m2.487s <br> user	0m5.606s  <br> sys	0m0.442s <br> 
[Set of 141 molecules](https://github.com/phi-grib/PaDEL-descriptor-ws/tree/master/input/individual)| PaDEL command-line | time ./test_cl_folders.sh <br> real	6m35.709s <br> user	15m28.519s <br> sys	1m1.071s

Using the PaDEL ws descriptors engine:

Molecule | Computation method | Computation time 
---------|--------------------|-------------------
[mol1](https://github.com/phi-grib/PaDEL-descriptor-ws/blob/master/input/individual/mol1/mol1.sdf)| PaDEL ws descriptors engine|time ./test_ws_single_molecule.sh <br> real	0m0.260s  <br> user	0m0.005s <br> sys	0m0.015s 
[Set of 141 molecules](https://github.com/phi-grib/PaDEL-descriptor-ws/tree/master/input/individual)| PaDEL ws descriptors engine|time ./test_ws_folders.sh <br> real	0m52.643s <br> user	0m0.398s <br> sys	0m0.946s

The throughput of descriptor computation is **increased by 7x** (test dataset).

If you want to obtain further information please contact the author Oriol López Massaguer oriol.lopez@upf.edu

Copyright 2017 Oriol Lopez

PaDEL ws descriptors engine is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation version 3.

 PaDEL ws descriptors engine is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with PaDEL ws descriptors engine. If not, see http://www.gnu.org/licenses/.

The research leading to these results has received support from the Innovative Medicines Initiative (IMI) Joint Undertaking under grant agreement n° 115002 (eTOX), resources of which are composed of financial contribution from the European Union’s Seventh Framework Programme (FP7/2007-2013) and EFPIA companies’ in kind contributions.
