# Battle.net API for Android

[![Download](https://api.bintray.com/packages/galex/maven/battlenet-api-android/images/download.svg) ](https://bintray.com/galex/maven/battlenet-api-android/_latestVersion) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/344f27ce49f940df8770836acb8aa926)](https://www.codacy.com/app/galex/battlenet-api-android?utm_source=github.com&utm_medium=referral&utm_content=galex/battlenet-api-android&utm_campaign=badger)
[![Build Status](https://travis-ci.org/galex/battlenet-api-android.svg?branch=master)](https://travis-ci.org/galex/battlenet-api-android) [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
                                                                                                                          
# Introduction

This library gives you access to the [APIs of Battle.net](https://dev.battle.net/io-docs) based on the [Retrofit](http://square.github.io/retrofit/) library.

# Oauth2

Some of the APIs require Oauth2, so for getting a valid access token you can use:
```java
OauthActivity.startActivity()
```
Check out the sampleapp module for the complete flow!

# Available APIs

### D3 Community API 

###### PROFILE API
* **CAREER PROFILE** /D3/PROFILE/:BATTLETAG/
* **HERO PROFILE** /D3/PROFILE/:BATTLETAG/HERO/:ID

###### DATA RESOURCES

* **ITEM DATA** /D3/DATA/ITEM/:DATA

### Community OAuth Profile API
###### ACCOUNT API
* **USER** /ACCOUNT/USER

### Game Data API
###### D3
* **USER** /ACCOUNT/USER
* **SEASON INDEX** /DATA/D3/SEASON/
* **SEASON** /DATA/D3/SEASON/:ID
* **SEASON LEADERBOARD** /DATA/D3/SEASON/:ID/LEADERBOARD/:LEADERBOARD
* **ERA INDEX** /DATA/D3/ERA/
* **ERA** /DATA/D3/ERA/:ID
* **ERA LEADERBOARD** /DATA/D3/ERA/:ID/LEADERBOARD/:LEADERBOARD

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
<string name="battlenet_lib_api_key">YOUR-API-KEY-HERE</string>
<string name="battlenet_lib_api_secret">YOUR-API-SECRETKEY-HERE</string>
```
