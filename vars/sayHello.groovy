#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Welcome, Hello, ${name}."
  sh "git clone https://github.com/bats-core/bats-core.git"
}
