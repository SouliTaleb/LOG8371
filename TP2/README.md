# 	***	LOG8371 Ingénierie de la qualité en logiciel	***

# 			*** Partie d'autoscaling ***

# Rentrer dans le dossier prometheus:
$] cd path-to/LOG8371/TP2/LOG8371/TP2/jguwekarest/docker-swarm-service-autoscaler/example/prometheus


# 1 - Démarrer les services:
$] ./run.sh


# 2 - Démarrer l'autoscaler:
$] docker service logs example_autoscaler -f


# 3 - Superviser les services en temps réel:
$] watch docker service ls


# 4 - Superviser les statistiques en temps réel:
$] docker stats [Options == dockerID]


# 5 - Executer les requêtes GET avec le script Python :
$] cd path-to/LOG8371/TP2/LOG8371/TP2/ThreadsTest.py
$] Ouvrir ThreadsTest.py avec Pycharm et l'executer


# 6 - Executer les requêtes GET avec le Benchmarcking :
$] cd path-to/LOG8371/TP2/LOG8371/TP2/jguwekarest/docker-swarm-service-autoscaler/example/prometheus
$] ./generate-load.sh
