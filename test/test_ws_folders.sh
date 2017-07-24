export HOME=/opt/PaDEL-descriptor-ws
for F in $HOME/input/individual/* # replace by $1 for first arg
do
   curl "http://localhost:9000/computedescriptors?params=-2d|-3d|-dir|$F|-file|$HOME/output/descriptors_ws_individual.txt"
done
