#!/usr/bin/env bash
set -e

# Always run from the project root directory
PROJECT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$PROJECT_DIR"

# Ensure bin directory exists
mkdir -p bin

echo "==> Compiling Java sources into bin/..."
javac -d bin -sourcepath src $(find src -name "*.java")

echo "==> Running application..."
echo "-------------------------------------------------"
java -cp bin com.sehatsentosa.app.Main "$@"
