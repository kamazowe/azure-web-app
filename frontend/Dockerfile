FROM node:12.19.0-alpine3.10 as builder

WORKDIR '/app'

COPY package*.json ./

RUN npm config set registry http://registry.npmjs.org/ \
    && npm install --no-optional

COPY . .

RUN npm run build-prod
# TODO alphine
FROM nginx:1.19.4-alpine

COPY ./nginx/default.conf /etc/nginx/conf.d/default.conf

COPY --from=builder /app/dist/apps/azure-web-app /usr/share/nginx/html
