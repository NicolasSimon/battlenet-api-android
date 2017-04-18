# Battle.net API for Android

[![Build Status](https://travis-ci.org/galex/battlenet-api-android.svg?branch=master)](https://travis-ci.org/galex/battlenet-api-android) [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
                                                                                                                          
# Introduction

This library gives you access to the [APIs of Battle.net](https://dev.battle.net/io-docs) based on the [Retrofit](http://square.github.io/retrofit/) library.

# Available APIs

### D3 Community API 

#### PROFILE API

- **CAREER PROFILE** /D3/PROFILE/:BATTLETAG/
- **HERO PROFILE** /D3/PROFILE/:BATTLETAG/HERO/:ID

# Library API

## Entry points

For every implemented entry point you get a class of the same name to access the API. 

Example: to call the CareerProfile of the D3 Community API:

```java
BattleTag battleTag = new BattleTag(USERNAME, NUMBER);
CareerProfile careerProfile = D3CommunityAPI.getCareerProfile(context, Region.EU, battleTag, Locale.ENGLISH);
```
## Sync vs Async
Every function will have two ways to be called:
* Synchronous (no callback at the end of the function)
* Asynchronous (with a retrofit callback at the end)

Example for the D3 Community API:
```java
// Synchronous
public static CareerProfile getCareerProfile(@NonNull Context context, @NonNull Region region, @NonNull BattleTag battleTag, @NonNull Locale locale);

// Asynchronous
public static void getCareerProfile(@NonNull Context context, @NonNull Region region, @NonNull BattleTag battleTag, @NonNull Locale locale, @NonNull Callback<CareerProfile> callback);
```

# Configuration

To set up your own API KEY and API SECRET, override the next values in your strings.xml:

```xml
<string name="api_key">YOUR-API-KEY-HERE</string>
<string name="api_secret">YOUR-API-SECRETKEY-HERE</string>
```

# DEV STATUS

Currently under development - come back soon :)
