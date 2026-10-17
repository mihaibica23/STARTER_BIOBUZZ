package org.firstinspires.ftc.teamcode.robot;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
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
            servo_cont;
    public static void initializare(HardwareMap hardwareMap)
    {
        //INITIALIZARE MOTOARE DC
        fs=hardwareMap.get(DcMotor.class,"motor_fs");
        fd=hardwareMap.get(DcMotor.class,"motor_fd");
        ss=hardwareMap.get(DcMotor.class,"motor_ss");
        sd=hardwareMap.get(DcMotor.class,"motor_sd");

        //INITIALIZARE MOTOARE SERVO
        servo1 = hardwareMap.get(Servo.class, "servo_cam1");
        //servo2 = hardwareMap.get(Servo.class, "NUME_MOTOR_SERVO_2");

        //INITIALIZARE MOTOARE SERVO CONTINUE
        servo_cont = hardwareMap.get(CRServo.class, "servo_cont");

        //INVERSARE MOTOARE
        fd.setDirection(DcMotorSimple.Direction.REVERSE);
        ss.setDirection(DcMotorSimple.Direction.REVERSE);
        fs.setDirection(DcMotorSimple.Direction.REVERSE);
    }
}
