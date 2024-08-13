import com.qualcomm.robotcore.eventloop.opmode.OpMode;


public class Joystickmovement extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        frontLeft.setPower(speedy);
        frontRight.setPower(-speedy);
        backRight.setPower(-speedy);
        backLeft.setPower(speedx);
        frontLeft.setPower(-speedx);
        frontRight.setPower(-speedx);
        backRight.setPower(speedx);
        double turnx = (gamepad1.right_stick_x);
        backLeft.setPower(-turnx);
        frontLeft.setPower(-turnx);
        frontRight.setPower(-turnx);
        backRight.setPower(-turnx);
        if (gamepad1.left_bumper) {

            backLeft.setPower(0);
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backRight.setPower(0);
        }
        double speedx2 = (gamepad2.left_stick_x) * 2;
        double speedy2 = (gamepad2.left_stick_y) * 2;
        backLeft.setPower(speedy2);
        frontLeft.setPower(speedy2);
        frontRight.setPower(-speedy2);
        backRight.setPower(-speedy2);
        backLeft.setPower(speedx2);
        frontLeft.setPower(-speedx2);
        frontRight.setPower(-speedx2);
        backRight.setPower(speedx2);
        double turnx2 = (gamepad2.right_stick_x);
        backLeft.setPower(-turnx2);
        frontLeft.setPower(-turnx2);
        frontRight.setPower(-turnx2);
        backRight.setPower(-turnx2);

    }
}


}
    }
}
