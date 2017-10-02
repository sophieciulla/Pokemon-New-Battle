
import java.util.*;

import org.omg.Messaging.SyncScopeHelper;

public class PokemonGame
	{
		static ArrayList<Pokemon> myPokemon = new ArrayList<Pokemon>();
		static int powerOfSkill = 0;
		static int powerOfSkillE = 0;
		public static void main(String[] args)
			{
				
				PokemonVersion.fillDictionary();
				theStart();
				battleFight();
				exAdding();
				levelUp();
				Evolution();
				
				
				
				

			}

		

	






		private static void checkStatus()
			{
				for(Pokemon p : myPokemon)
					{
						System.out.println("Name: " + p.getName());
						System.out.println("Type: " + p.getType());
						System.out.println("Level: " + p.getLevel());
						System.out.println("HP: " + p.getHealthPoint());
						System.out.println("AttackPoint: " + p.getAttackPoint());
						System.out.println("DefencePoint: " + p.getDefencePoint());
						System.out.println("Skill1: " + p.getSkill1());
						System.out.println("Skill2: " + p.getSkill2());
						System.out.println("Skill3: " + p.getSkill3());
						System.out.println("Skill4: " + p.getSkill4());
						
						
					}
				
			}

		private static void Chooser()
			{
				Scanner  userinput = new Scanner(System.in);
				System.out.println("At first, you need to pick up your first pokemon");
				System.out.println("1. Bulbasaur.     2. Charmander.     3. Squirtle");
				String chooser = userinput.nextLine();
				if(chooser.equals("Bulbasaur")||chooser.equals("1"))
					{
						System.out.println("Here is your pokemon: Bulbasaur!!!");
						myPokemon.add(PokemonVersion.dictionary.get(0));
						checkStatus();
						
						
					}
				else if(chooser.equals("Charmander")||chooser.equals("2"))
					{
						System.out.println("Here is your pokemon: Charmander!!!");
						myPokemon.add(PokemonVersion.dictionary.get(3));
						checkStatus();
						
					}
				else if(chooser.equals("Squirtle")||chooser.equals("3"))
					{
						System.out.println("Here is your pokemon: Squirtle!!!");
						myPokemon.add(PokemonVersion.dictionary.get(6));
						checkStatus();
						
					}
				else
					{
						System.out.println("pick error, please pick the number or the name");
						Chooser();
					}
				
			}

		private static void theStart()
			{
				Scanner  userinput = new Scanner(System.in);
				System.out.println("Welcome to the Pokemon world!");
				String space1 = userinput.nextLine();
				System.out.println("I am your helper: Pikachu!!!");
				String space2 = userinput.nextLine();
				System.out.println("/＼7　　　 ∠＿/");
				System.out.println(" /　│　　 ／　／");
				System.out.println("│　Z ＿,＜　／          /`ヽ");
				System.out.println("│　　　　　ヽ　　          /　　〉");
				System.out.println("Y　　　　　` |    /　　/");
				System.out.println("ｲ●　､　●　　   |  〈　　/");
				System.out.println("()　 v　  　()　     ＼ 〈");
				System.out.println(">ｰ ､_　  ィ    │  ／／");
				System.out.println(" / へ　  /　ﾉ| ＼＼");
				System.out.println("ヽ_ﾉ　　(_／　 │／／");
				System.out.println("7　　　　　　　|／");
				System.out.println("　＞―r￣￣`ｰ―＿");
				String space3 = userinput.nextLine();
				System.out.println("At here, you will  become a trainer, and start to experience the Pokemon Battle");
				String space4 = userinput.nextLine();
				Chooser();
				
				
				
				
			}

		private static void battleFight()
			{
				Scanner  userinput = new Scanner(System.in);
				String space = userinput.nextLine();
				System.out.println("......");
				System.out.println("......");
				System.out.println("......");
				System.out.println("......");
				System.out.println("......");
				int randomNumber = (int)(Math.random()*3);
				int randomNumber1 = randomNumber*3;
				int randomNumber2 = randomNumber*3+1;
				int randomNumber3 = randomNumber*3+2;
				if(myPokemon.get(0).getLevel()<17)
					{
						System.out.println("the wild " + PokemonVersion.dictionary.get(randomNumber1).getName() + " jumps out, time to fight");
						String space1 = userinput.nextLine();
						int wildPokemonLevel = myPokemon.get(0).getLevel()-2;
						System.out.println();
						System.out.println(PokemonVersion.dictionary.get(randomNumber1).getName());
						System.out.println("level: " + wildPokemonLevel);
					    int wildPokemonHP = myPokemon.get(0).getHealthPoint()-40;
						System.out.println("HP: " + wildPokemonHP);
						String space2 = userinput.nextLine();
						
						System.out.println("which skills you want to choose?");
						System.out.println("1. " + myPokemon.get(0).getSkill1() + "  2. " + myPokemon.get(0).getSkill2() + "  3. " + myPokemon.get(0).getSkill3() + "  4. " + myPokemon.get(0).getSkill4());
						
						int wildPokemonAttack = myPokemon.get(0).getAttackPoint()-10;
						int wildPokemonDefence = myPokemon.get(0).getDefencePoint()-4;
						int differenceOfAttAndDef = myPokemon.get(0).getAttackPoint() / wildPokemonDefence;
						int differenceOfDefAndAtt = wildPokemonAttack / myPokemon.get(0).getDefencePoint();
						int myPokemonHP = myPokemon.get(0).getHealthPoint();
						int totalDamageToEnemy = 0;
						int totalDamageToPlayer = 0;
						while(myPokemonHP>0&&wildPokemonHP>0)
						{
							userChooseSkill();
							enemyRandomChooseSkill();
							int randomNumberAttack = (int)(Math.random()*10)+1;
							
								switch(randomNumberAttack)
								{
									case 1:
										{

											totalDamageToEnemy = 0;
											wildPokemonHP = wildPokemonHP - totalDamageToEnemy;
											System.out.println("OH no, you miss, so you made the " + totalDamageToEnemy + " damage");
											System.out.println(PokemonVersion.dictionary.get(randomNumber1).getName() + " has " + wildPokemonHP + " HP left");
											System.out.println();
											
										}
									case 2:
									case 3:
									case 4:
									case 5:
									case 6:
									case 7:
									case 8:
									case 9:
										{
											
											totalDamageToEnemy = differenceOfAttAndDef * powerOfSkill / 10;
											wildPokemonHP = wildPokemonHP - totalDamageToEnemy;
											System.out.println("you made the " + totalDamageToEnemy + " damage");
											System.out.println(PokemonVersion.dictionary.get(randomNumber1).getName() + " has " + wildPokemonHP + " HP left");
											System.out.println();
											
											
										}
									case 10:
										{

											totalDamageToEnemy = differenceOfAttAndDef * powerOfSkill / 5;
											wildPokemonHP = wildPokemonHP - totalDamageToEnemy;
											System.out.println("Good job, that is critical, you made the " + totalDamageToEnemy + " damage");
											System.out.println(PokemonVersion.dictionary.get(randomNumber1).getName() + " has " + wildPokemonHP + " HP left");
											System.out.println();
											
										}
										
								}
								
							
							int randomNumberAttack2 = (int)(Math.random()*10)+1;
							
								switch(randomNumberAttack2)
								{
									case 1:
										{
											totalDamageToPlayer = 0;
											myPokemonHP = myPokemonHP - totalDamageToPlayer;
											System.out.println("the wild pokemon missed, so " + PokemonVersion.dictionary.get(randomNumber1).getName() + " made " + totalDamageToPlayer + " damage to you");
											System.out.println("your pokemon has " + myPokemonHP + " HP left");
											System.out.println();
											
										}
									case 2:
									case 3:
									case 4:
									case 5:
									case 6:
									case 7:
									case 8:
									case 9:
										{
											
											totalDamageToPlayer = differenceOfDefAndAtt * powerOfSkillE / 10;
											myPokemonHP = myPokemonHP - totalDamageToPlayer;
											System.out.println(PokemonVersion.dictionary.get(randomNumber1).getName() + " made " + totalDamageToPlayer + " damage to you");
											System.out.println("your pokemon has " + myPokemonHP + " HP left");
											System.out.println();
											
										}
									case 10:
										{
											totalDamageToPlayer = differenceOfDefAndAtt * powerOfSkillE / 5;
											myPokemonHP = myPokemonHP - totalDamageToPlayer;
											System.out.println("Oh no, the wild pokemon made a critical, so " + PokemonVersion.dictionary.get(randomNumber1).getName() + " made " + totalDamageToPlayer + " damage to you");
											System.out.println("your pokemon has " + myPokemonHP + " HP left");
											System.out.println();
											
										}	
								}	
								
							
								
							
								
							
								
							
						}
						
					}
						
						
						
					
				else if(myPokemon.get(0).getLevel()>17&&myPokemon.get(0).getLevel()<37)
					{
						
						
					}
				else if(myPokemon.get(0).getLevel()>37)
					{
						
					}
				else
					{
						
					}
				
			}

		private static void enemyRandomChooseSkill() 
			{
				int randomNumber = 0;
				if(myPokemon.get(0).getLevel()<17)
				{
					randomNumber = (int)(Math.random()*2)+1;
				}
				else if(myPokemon.get(0).getLevel()>16&&myPokemon.get(0).getLevel()<37)
				{
					randomNumber = (int)(Math.random()*3)+1;
				}
				else if(myPokemon.get(0).getLevel()>37)
				{
					randomNumber = (int)(Math.random()*4)+1;
				}
				else
				{
					
				}
				switch(randomNumber)
				{
					case 1:
						{
							powerOfSkillE = PokemonVersion.dictionary.get(2).getSkill1Power();
						}
					case 2:
						{
							powerOfSkillE = PokemonVersion.dictionary.get(2).getSkill2Power();
						}
					case 3:
						{
							powerOfSkillE = PokemonVersion.dictionary.get(2).getSkill3Power();
						}
					case 4:
						{
							powerOfSkillE = PokemonVersion.dictionary.get(2).getSkill4Power();
						}
				}
							
			}

		private static void userChooseSkill()
			{
				Scanner  userinput = new Scanner(System.in);
				int userChoose = userinput.nextInt();
				if(userChoose == 1)
					{
						powerOfSkill = myPokemon.get(0).getSkill1Power();
					}
				else if(userChoose == 2)
					{
						powerOfSkill = myPokemon.get(0).getSkill2Power();
					}
				else if(userChoose == 3)
					{
						powerOfSkill = myPokemon.get(0).getSkill3Power();
					}
				else if(userChoose == 4)
					{
						powerOfSkill = myPokemon.get(0).getSkill4Power();
					}
				else
					{
						System.out.println("error pick, do it again");
						userChooseSkill();
						
					}
				
				
			}

		private static void exAdding()
			{
				
				
			}

		private static void levelUp()
			{
				
				
			}

		private static void Evolution()
			{
				
				
			}
		




	}
