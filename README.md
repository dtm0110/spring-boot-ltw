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

## [`/miaswap-cg/pairs`](https://cmc-cg-api.miaswap.io/miaswap-cg/pairs)
Details on cryptoassets traded on an exchange.
### Request
`GET https://cmc-cg-api.miaswap.io/miaswap-cg/pairs`
### Response
```json5
  {
    "ticker_id": "BTC_ETH", // Identifier of a ticker with delimiter to separate base/target.
    "base": "BTC",          // Symbol/currency code of a the base cryptoasset.
    "target": "ETH",        // Symbol/currency code of the target cryptoasset.
  }
```
## [`/miaswap-cg/tickers`](https://cmc-cg-api.miaswap.io/miaswap-cg/tickers)
Market related statistics for all markets for the last 24 hours.
### Request
`GET https://cmc-cg-api.miaswap.io/miaswap-cg/pairs`
### Response
```json5
  {
    "ticker_id": "BTC_ETH", // Identifier of a ticker with delimiter to separate base/target.
    "base": "BTC",          // Symbol/currency code of a the base cryptoasset.
    "target": "ETH",        // Symbol/currency code of the target cryptoasset.
    "last_price":"50.0",    // Last transacted price of base currency based on given target currency (unit in base or target).
    "base_volume":"10",     // 24 hour trading volume in base pair volume (unit in base).
    "target_volume":"500",  // 24 hour trading volume in target pair volume (unit in target).
  }
```
## [`/miaswap-cg/orderbook?ticker_id=BTC_BUSD`](https://cmc-cg-api.miaswap.io/miaswap-cg/pairs)
Order book depth of any given trading pair
### Request
`GET https://cmc-cg-api.miaswap.io//miaswap-cg/orderbook?ticker_id=BTC_ETH`
### Response
```json5
  {
    "ticker_id": "BTC_ETH", // Identifier of a ticker with delimiter to separate base/target.
    "bids": "[]",          // An array containing 2 elements. The offer price and quantity for each bid order.
    "asks": "[]",        // An array containing 2 elements. The ask price and quantity for each ask order
  }
```
