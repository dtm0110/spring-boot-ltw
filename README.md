# DOCUMENTATION
    


## COINMARKETCAP
## [`/mia/get`](https://cmc-cg-api.miaswap.io/mia/get)
Returns data for the MiaSwap pairs.

### Request 
`Get https://cmc-cg-api.miaswap.io/mia/get`

### Response 
```json5
    {
        "0x..._0x...": {                // the asset ids of tokens, joined by an underscore
            "base_id": "0x...",         // token0 address
            "base_name": "...",         // token0 name
            "base_symbol": "...",       // token0 symbol
            "quote_id": "...",          // token0 address
            "quote_name": "...",        // token0 name
            "quote_symbol": "...",      // token0 symbol
            "last_price": "...",        // price denominated in token1/token0
            "base_volume": "...",       // volume denominated in token0
            "quote_volume": "..."       // volume denominated in token1
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
        "provider": "...",              //provider name
        "provider_URL": "URL",          //provider URL
        "provider_logo": "URL",         //provider logo
        "pools": [                      //list pool
            {
                "name": "...",          //pair name
                "pair": "...",          //pair symbol
                "pairLink": "URL",      //pair link
                "logo": "",             //pair logo
                "poolRewards": [
                    "MIA"
                ],
                "totalStaked": "...",   //total Liquidity
                "apr": "..."            //apr farm
            },
            ///...
        ]
    }
```



## COINGECKO
