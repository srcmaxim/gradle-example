FROM node
RUN npm install -g @cloudflare/wrangler
ENV CF_ACCOUNT_ID=<CF_ACCOUNT_ID>
ENV CF_API_TOKEN=<CF_API_TOKEN>
RUN mkdir app
COPY . app/
WORKDIR app
CMD wrangler dev
