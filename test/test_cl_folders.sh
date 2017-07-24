export HOME=/opt/PaDEL-descriptor-ws
for F in $HOME/input/individual/* # replace by $1 for first arg
do
   java -jar $HOME/padel_original/PaDEL-Descriptor.jar -2d -3d -dir $F -file $HOME/output/descriptors_cl_individual.txt
done
