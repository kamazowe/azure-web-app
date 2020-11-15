FROM node:12.1.0 as builder

WORKDIR '/app'

COPY package*.json /app/

RUN npm install

COPY . /app/

RUN npm run build

FROM nginx

COPY ./nginx/default.conf /etc/nginx/conf.d/default.conf

COPY --from=builder /app/dist/apps/azure-web-app /usr/share/nginx/html
