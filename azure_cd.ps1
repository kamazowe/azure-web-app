az webapp config container set -g kamazowe-azure-web-app-rg -n kamazowe-azure-web-app --multicontainer-config-type compose --multicontainer-config-file "docker-compose.prod.yml"
az webapp stop -g kamazowe-azure-web-app-rg -n kamazowe-azure-web-app
az webapp start -g kamazowe-azure-web-app-rg -n kamazowe-azure-web-app
