import os

# Folder Name
folder_name = "Java_Tricky_Patterns"

# Create Folder
os.makedirs(folder_name, exist_ok=True)

# Pattern Names and Examples
patterns = {
    "HollowPyramid": """
// Example_Output
// ____*
// ___*_*
// __*___*
// _*******

""",

    "DiamondPattern": """
// Example_Output
// ___*
// __***
// _*****
// __***
// ___*

""",

    "ButterflyPattern": """
// Example_Output
// *_ _ _ _*
// **_ _ _**
// ***_ _***
// *********
// ***_ _***
// **_ _ _**
// *_ _ _ _*

""",

    "PascalTriangle": """
// Example_Output
// ______1
// _____1_1
// ____1_2_1
// ___1_3_3_1

""",

    "FloydTriangle": """
// Example_Output
// 1
// 2_3
// 4_5_6
// 7_8_9_10

""",

    "ZigZagPattern": """
// Example_Output
// __*___*
// _*_*_*_*
// *___*___*

""",

    "SandglassPattern": """
// Example_Output
// ********
// _******
// __****
// ___**
// __****
// _******
// ********

""",

    "HollowDiamond": """
// Example_Output
// ___*
// __*_*
// _*___*
// __*_*
// ___*

""",

    "NumberPyramid": """
// Example_Output
// ___1
// __121
// _12321
// 1234321

""",

    "PalindromePattern": """
// Example_Output
// ___1
// __212
// _32123
// 4321234

""",

    "BinaryTriangle": """
// Example_Output
// 1
// 01
// 101
// 0101

""",

    "SpiralMatrix": """
// Example_Output
// 1__2__3__4
// 12_13_14_5
// 11_16_15_6
// 10_9__8__7

""",

    "HourglassPattern": """
// Example_Output
// ********
// _******
// __****
// ___**
// __****
// _******
// ********

""",

    "SnakePattern": """
// Example_Output
// 1_2_3_4
// 8_7_6_5
// 9_10_11_12

""",

    "CharacterPyramid": """
// Example_Output
// ___A
// __ABA
// _ABCBA
// ABCDCBA

""",

    "ZeroOneTriangle": """
// Example_Output
// 1
// 0_1
// 1_0_1
// 0_1_0_1

""",

    "RhombusPattern": """
// Example_Output
// ____****
// ___****
// __****
// _****

""",

    "HollowSquareDiagonal": """
// Example_Output
// *****
// **__*
// *_*_*
// *__**
// *****

""",

    "ReverseNumberTriangle": """
// Example_Output
// 12345
// 1234
// 123
// 12
// 1

""",

    "ConcentricRectangle": """
// Example_Output
// 4_4_4_4_4
// 4_3_3_3_4
// 4_3_2_3_4
// 4_3_3_3_4
// 4_4_4_4_4

"""
}

# Java Template
template = """import java.util.Scanner;

public class {classname} {{

    public static void main(String[] args) {{

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter_size: ");
        n = sc.nextInt();

{example}

        // Write_Your_Pattern_Logic_Here

    }}
}}
"""

# Create Java Files
for classname, example in patterns.items():

    file_path = os.path.join(folder_name, classname + ".java")

    with open(file_path, "w") as file:
        file.write(template.format(
            classname=classname,
            example=example
        ))

print("All_20_Java_Pattern_Files_Created_Successfully!")