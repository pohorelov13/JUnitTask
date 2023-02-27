0. ������� ������.



1. � ������ ������ ����� libs



2. ���������� ���������� JUnit Platform Console Standalone � Maven Repository � ������ jar-����� 
3. (���. ��������� � ���� �� �����).



2.1 ����������� � ��������� ����������� ��� ���������� �� ���������� 
https://junit.org/junit5/docs/current/user-guide/#running-tests-console-launcher



3. ����� jar-���� �� ����� libs �� �������� ������ � ������ �������� .



4. ������� ���� TestRunner ��� ������� �����.



5. � ���� ProjectTestRunner ������� ������:

- ��� ������� ����� �� ��'� ����� (������� ��������)

- ��� ������� ����� �� ��'� ����� (��� ����� ����)

- ��� ������� ����� �� ������� ����� (������� ��������)

- ��� ������� ����� �� ������� ����� ( ��� ����� ����)

- ��� ������� ����� �� ������������� � ����� (������� ��������)



6. ������� ���� SimpleMathLibrary. ���� ������ �� ��������:

- ��������� (add) ��� ���� ���������. ����������� ��� double.

- ³�������� (minus) ��� ���� ���������. ����������� ��� double.



7. ������� ���� SimpleMathLibraryTest. ���� ������ �����-����� (������) ��������� @Test



8. � ���� SimpleMathLibraryTest ���������� ������ � ��������� ��������� ��������:

- SimpleMathLibrary#add

- SimpleMathLibrary#minus

�������� ����������� ���������� ����������� �� ��������� �������� ���������.

���������:

���� � == 2 ��� sout(�OK�), ������ sout(�NOK�)



9. ������� �������� �� ������� ����� �� ������� ��������� ��������� � �������.

���������:

Test run finished after 64 ms

[ 5 containers found ]

[ 0 containers skipped ]

[ 5 containers started ]

[ 0 containers aborted ]

containers successful ]

[ 0 containers failed ]

[ 6 tests found ]

[ 1 tests skip

510.

�������
*�

. 9, ��� ����� ��������� ��������� ������� � ����.

11. ** ������� ���� TestResultParser �� ������� parse.

- ��� �������� ����� �� ����� (������� ��������)

- ��� �������� ����� �� ����� (��� ����� File)

- ��� �������� ����� �� ����� (��� ����� Path)



12. ** ����� parse � ���� TestResultParser ��������� ����� �����, ���� ���������� ���� (������� �� ������)

����� ���������� ��� ��������� �����.



13. ** ϳ��� ��������� ��������, ������� ��'��� TestResult, ���� ������ �������� ����������:

- �������� ������� �����

- ʳ������ ������ ��������� �����

- ʳ������ ���������� �����

- ��������� ��� ������� ����� (����� ��������������� ��� ����� Date)

14. ������� �����, ����� �� �������� ���������� �� �������� ����������� ������� �����. ����� ������� ��������� ����� �����, ��������� ������ ����������� � ��������� ������ ��������, �� ����� ���� �������� �������. ������� ����� ������� ����� ���� � ���� �������, ������ � ����� ��������� �������� RuntimeException.

������� ���� ����� ����� ������ (�� 3-4 ������� ������� �����).

���������: [1 2 4 4 2 3 4 1 7] -> ���: [1 7].


15. ������� �����, ���� �������� ����� ������ � ����� 1 � 4. ���� � ����� ���� ��� ������ ������� �� �������, �� ����� ������� false; �������� ���� ����� ����� ������ (�� 3-4 ������� ������� �����).


���������:

[ 1 1 1 4 4 1 4 4 ] -> true

[ 1 1 1 1 1 1 ] -> false

[ 4 4 4 4 ] -> false

[ 1 4 4 1 1 4 3 ] -> false