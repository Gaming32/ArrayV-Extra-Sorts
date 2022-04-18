# ArrayV Extra Sorts Pack

This is the repo for [ArrayV](https://github.com/Gaming32/ArrayV-v4.0)'s Extra Sorts Pack. This repo houses many community-made sorts. It has a built-in link to ArrayV, and can be automatically downloaded and linked through ArrayV's "Choose Sort" dialog.

## Installing

### The easy way (through the UI)

The easiest way to install the Extra Sorts Pack is to go to the Choose Sorts menu in ArrayV and select either "Install Extra Sorts Pack" or "Update Extra Sorts Pack".

### The harder way (manually)

Obtain an Extra Sorts Pack JAR (see [Obtaining a JAR](#obtaining-a-jar-if-you-want-one)), then find the folder you launch ArrayV from. In this folder, either find or create a folder named "cache". Put the Extra Sorts Pack JAR in the cache folder.

## Obtaining a JAR (if you want one)

To get your hands on a shiny `ArrayV-Extra-Sorts.jar`, you can download a JAR from [nightly.link](https://nightly.link/Gaming32/ArrayV-Extra-Sorts/workflows/build/main/extra-sorts-jar.zip). Alternatively, you can manually build ArrayV-Extra-Sorts (see [Building](#building)).

## Building

**NOTE:** You should really have some level of technical experience if you want to build this yourself.

To build ArrayV-Extra-Sorts, simply clone and compile ArrayV-Extra-Sorts with Maven. You can find the built JAR in the `target` directory.

```shell
git clone https://github.com/Gaming32/ArrayV-Extra-Sorts
cd ArrayV-Extra-Sorts
./mvnw verify
```

## Contributing to the pack

See [our doc on contributing](CONTRIBUTING.md).
