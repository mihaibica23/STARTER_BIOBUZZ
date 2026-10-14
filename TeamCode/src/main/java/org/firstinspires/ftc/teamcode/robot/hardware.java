package org.firstinspires.ftc.teamcode.robot;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class hardware {
    //DECLARARE MOTOARE DC - FATA_STANGA, FATA_DREAPTA, SPATE_STANGA, SPATE_DREAPTA
    public static DcMotor fs,
    fd,
    ss,
    sd;

    //DECLARARE MOTOARE SEVO
    public static Servo
    servo1,
    servo2;

    //DECLARARE MOTOARE SERVO CONTINUE
    public static CRServo
    c_servo;
    public static void initializare(HardwareMap hardwareMap)
    {
        //INITIALIZARE MOTOARE DC
        fs=hardwareMap.get(DcMotor.class,"NUME_MOTOR_FATA_STANGA");
        fd=hardwareMap.get(DcMotor.class,"NUME_MOTOR_FATA_DREAPTA");
        ss=hardwareMap.get(DcMotor.class,"NUME_MOTOR_SPATE_STANGA");
        sd=hardwareMap.get(DcMotor.class,"NUME_MOTOR_SPATE_DREAPTA");

        //INITIALIZARE MOTOARE SERVO
        servo1 = hardwareMap.get(Servo.class, "NUME_MOTOR_SERVO_1");
        servo2 = hardwareMap.get(Servo.class, "NUME_MOTOR_SERVO_2");

        //INITIALIZARE MOTOARE SERVO CONTINUE
        c_servo = hardwareMap.get(CRServo.class, "NUME_MOTOR_SERVO_CONTINUU");
    }
}
