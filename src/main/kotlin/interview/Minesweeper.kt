package interview

fun minesweeper(matrix: Array<String>) {
    val numOfRows = matrix.size
    val numOfColumns = matrix[0].length
    matrix.forEachIndexed { rowIndex, row ->
        row.forEachIndexed { columnIndex, cell ->
            if (cell == 'X') {
                print(cell)
            } else {
                var n = 0
                if (rowIndex > 0 && columnIndex > 0 && matrix[rowIndex - 1][columnIndex - 1] == 'X') n++
                if (rowIndex > 0 && matrix[rowIndex - 1][columnIndex] == 'X') n++
                if (rowIndex > 0 && columnIndex < numOfColumns - 1 && matrix[rowIndex - 1][columnIndex + 1] == 'X') n++
                if (columnIndex > 0 && matrix[rowIndex][columnIndex - 1] == 'X') n++
                if (columnIndex < numOfColumns - 1 && matrix[rowIndex][columnIndex + 1] == 'X') n++
                if (rowIndex < numOfRows - 1 && columnIndex > 0 && matrix[rowIndex + 1][columnIndex - 1] == 'X') n++
                if (rowIndex < numOfRows - 1 && matrix[rowIndex + 1][columnIndex] == 'X') n++
                if (rowIndex < numOfRows - 1 && columnIndex < numOfColumns - 1 && matrix[rowIndex + 1][columnIndex + 1] == 'X') n++
                print(n)
            }
        }
        println()
    }
}