# DOCUMENTATION
    


## COINMARKETCAP
    -- /mia/get --
    Returns data for the MiaSwap pairs.

    ** Request **
    Get https://cmc-cg-api.miaswap.io/mia/get

    ** Response **
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

    -- /faming/get --
    Returns data for the MiaSwap farms.

    ** Request **
    Get https://cmc-cg-api.miaswap.io/farming/get

    ** Response **
    {
    provider: 'MiaSwap',
    provider_logo: 'URL',
    provider_URL: 'URL',
    links: [
        {
        title: '...',
        link: 'URL',
        },
        //...
    ],
    pools: [
        {
        name: 'Pool Name 1',
        pair: '...-...',
        pairLink: '...',
        logo: 'URL',
        poolRewards: [
            'MIA'
        ],
        apr: ...,
        totalStaked: ...,
        
        },
        //...
    }
  ]
}


## COINGECKO
