# DOCUMENTATION
    


## COINMARKETCAP
## [`/mia/get`](https://cmc-cg-api.miaswap.io/mia/get)
Returns data for the MiaSwap pairs.

### Request 
`Get https://cmc-cg-api.miaswap.io/mia/get`

### Response 
```json5
    {
        "0x..._0x...": {
            "base_id": "0x...",
            "base_name": "...",
            "base_symbol": "...",
            "quote_id": "...",
            "quote_name": "...",
            "quote_symbol": "...",
            "last_price": "...",
            "base_volume": "...",
            "quote_volume": "..."
        },
        //...
    }
```
## [`/faming/get`](https://cmc-cg-api.miaswap.io/farming/get)
Returns data for the MiaSwap farms.

### Request 
`Get https://cmc-cg-api.miaswap.io/farming/get`

### Response 
```json5
    {
        "links": [
            {
                "link": "URL",
                "title": "..."
            },
            //...
        ],
        "provider": "...",
        "provider_URL": "URL",
        "provider_logo": "URL",
        "pools": [
            {
                "name": "...",
                "pair": "...",
                "pairLink": "URL",
                "logo": "",
                "poolRewards": [
                    "MIA"
                ],
                "totalStaked": "...",
                "apr": "..."
            },
            {
                "name": "...",
                "pair": "...",
                "pairLink": "URL",
                "logo": "",
                "poolRewards": [
                    "MIA"
                ],
                "totalStaked": "...",
                "apr": "..."
            },
            ///...
        ]
    }
```



## COINGECKO
