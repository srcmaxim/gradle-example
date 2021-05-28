# 👷 Telegram Bot for CI notifications

A template for kick starting a Cloudflare worker project.

[`index.js`](https://github.com/cloudflare/worker-template/blob/master/index.js) is the content of the Workers script.

#### Wrangler

To generated using [wrangler](https://github.com/cloudflare/wrangler)

```
wrangler generate projectname https://github.com/cloudflare/worker-template
```

Further documentation for Wrangler can be found [here](https://developers.cloudflare.com/workers/tooling/wrangler).

#### Run Wrangler in dev mode

1. Add secrets to Worker

```
CF_ACCOUNT_ID=<CF_ACCOUNT_ID>
CF_API_TOKEN=<CF_API_TOKEN>
wrangler secret put ${TELEGRAM_USER_ID} --env TELEGRAM_USER_ID
wrangler secret put ${TELEGRAM_BOT_TOKEN} --env TELEGRAM_BOT_TOKEN
```

2. Execute Worker in dev mode

```
CF_ACCOUNT_ID=<CF_ACCOUNT_ID>
CF_API_TOKEN=<CF_API_TOKEN>
docker build -t telegram-bot .
docker run -p80:80 -eCF_ACCOUNT_ID=${CF_ACCOUNT_ID} -eCF_API_TOKEN=${CF_API_TOKEN} telegram-bot
curl -w "\n" http://localhost/health
```
