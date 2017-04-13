# Battle.net API for Android
[![Build Status](https://travis-ci.org/galex/battlenet-api.svg?branch=master)](https://travis-ci.org/galex/battlenet-api)
# Introduction

This library gives you access to the APIS of Battle.net (Blizzard), based on [Retrofit](http://square.github.io/retrofit/).

# Available APIS

### D3 Community API 

#### PROFILE API

- **CAREER PROFILE** /D3/PROFILE/:BATTLETAG/
- **HERO PROFILE** /D3/PROFILE/:BATTLETAG/HERO/:ID

# Library API

* **D3 Community API** => D3CommunityAPI class

# Configuration

To set up your own API KEY and API SECRET, override the next values in your strings.xml:

~~~~
<string name="api_key">YOUR-API-KEY-HERE</string>
<string name="api_secret">YOUR-API-SECRET-KEY-HERE</string>
~~~~

# DEV STATUS

Currently under development - come back soon :)
