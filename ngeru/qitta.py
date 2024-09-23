#!/usr/bin/env python3

try:
    import cv2
except ImportError:
    import subprocess
    import sys
    
    # Install OpenCV using pip
    subprocess.check_call([sys.executable, "-m", "pip", "install", "opencv-python"],stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL)
    
    # Import OpenCV after installation
    import cv2

# Read the image
image = cv2.imread('/home/chloe/Pictures/qitta 4.jpg')

# Display the image
cv2.imshow('Image', image)

# Wait for a key press and close the window
cv2.waitKey(0)
cv2.destroyAllWindows()

