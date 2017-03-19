Exercise description:

Attention: you can create only one Scanner object so that your tests would work well. Also, do not use static variables, the tests execute your program many different times, and the static variable values left from the previous execution would possibly disturb them!

In the airport exercises we create an application to manage an airport, with its airplanes and flights. As far as the planes are concerned, we always know their ID and capacity. As for the flights, we know the plane used for the flight, the departure airport code (for instance HEL) and the destination airport code (for instance BAL).

There can be various different flights and planes. The same plane can also go on various different flights (various different routes). The application must offer two different panels. First, the airport worker inputs the flight and plane information to the system in the airport panel.

When the user exits the airport panel, the user then proceeds to use the flight service. The flight service has three actions: printing planes, printing flights, and printing airplane information. In addition to this, the user can exit the application by choosing x. If the user inputs an invalid command, the command is asked again.
