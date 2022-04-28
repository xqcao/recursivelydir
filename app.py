import os

def main(rootpath):
  fls =os.listdir(rootpath)
  for x in fls:
    if os.path.isdir(f"{rootpath}/{x}"):
      main(f"{rootpath}/{x}")
    else:
      print(f"{rootpath}/{x}")
  pass
  
if __name__ == '__main__':
  filepath="ff"
  main(filepath)