class maps {
    static void main(String[] args) {
        //key value pair
        //unordered collection
        //[keys : values]

        def employee = ['Name'       : 'John',
                        'Age'        : '27',
                        'Blood Group': 'O+']

        println(employee)
        println(employee.get('Age'))
        println(employee.getAt('Age'))

        println employee.size()
        employee.put('City', 'Dhaka')
        println(employee)
        println employee.containsKey('City')
        println employee.containsValue('Paris')
        println(employee.getClass())

        def emp2 = employee.clone()
        println(emp2)

        //iterate
        println("Iteration through closure")
        employee.each { key, value ->

            println("$key : $value")
        }
        employee.eachWithIndex { key, value, i ->
            println("$i | $key : $value")
        }

        employee.eachWithIndex { entry, i ->
            println("$i | $entry.key: $entry.value")
        }

        def map1 = ['a': 1,
                    'b': 2]

        def entries = map1.entrySet()
        entries.each { entry ->
            assert entry.key in ['a', 'b']
            assert entry.value in [1, 2]
        }
    }

    }

