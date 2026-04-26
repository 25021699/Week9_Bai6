#!/bin/bash
ROOT_DIR=$(pwd)

echo "Dang thuc thi Kiem thu va Kiem tra do bao phu (JaCoCo)"
mvn -f "$ROOT_DIR/pom.xml" clean verify

echo "Hoan tat! Neu Build Success nghia la Coverage cua ban > 80%."
