import time
import RPi.GPIO as GPIO

red_led = 17
yellow_led = 27
green_led = 22

GPIO.setmode(GPIO.BCM)
GPIO.setup(red_led, GPIO.OUT)
GPIO.setup(yellow_led, GPIO.OUT)
GPIO.setup(green_led, GPIO.OUT)

while TRUE:
    # green_led
    GPIO.output(green_led, 1)
    time.sleep(13)
    GPIO.output(green_led, 0)
    time.sleep(1)
    GPIO.output(green_led, 1)
    time.sleep(1)
    GPIO.output(green_led, 0)
    time.sleep(1)
    GPIO.output(green_led, 1)
    time.sleep(1)
    GPIO.output(yellow_led, 1)
    time.sleep(13)
    GPIO.output(yellow_led, 0)
    time.sleep(1)
    GPIO.output(red_led, 1)
    time.sleep(13)
    GPIO.output(red_led, 0)
    time.sleep(1)

GPIO.cleanup()
