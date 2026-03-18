# Contributing to OOPs_JAVA

## How to Upload a Folder from Your Computer

GitHub's website does not support uploading an entire folder in one step through the browser. Below are the recommended methods to upload a folder directly from your computer.

---

### Method 1: Using Git (Command Line) — Recommended

1. **Install Git**
   Download and install Git from https://git-scm.com/downloads if you haven't already.

2. **Clone the repository**
   ```bash
   git clone https://github.com/Piyush-singh2/OOPs_JAVA.git
   ```

3. **Copy your folder into the cloned repository**
   Move or copy your folder into the `OOPs_JAVA` directory that was just created.

4. **Stage the new files**
   ```bash
   cd OOPs_JAVA
   git add <your-folder-name>/
   ```

5. **Commit the changes**
   ```bash
   git commit -m "Add <your-folder-name>"
   ```

6. **Push to GitHub**
   ```bash
   git push origin main
   ```
   > If you are working on a feature branch, replace `main` with your branch name.

---

### Method 2: Using GitHub Desktop (GUI)

1. **Install GitHub Desktop**
   Download it from https://desktop.github.com/.

2. **Clone the repository**
   Open GitHub Desktop → *File* → *Clone repository* → select `Piyush-singh2/OOPs_JAVA`.

3. **Copy your folder**
   Open the repository's local folder (click *Repository* → *Show in Explorer / Finder*) and paste your folder there.

4. **Commit and push**
   - GitHub Desktop will automatically detect the new folder.
   - Add a summary message in the *Summary* field.
   - Click **Commit to main**.
   - Click **Push origin** to upload to GitHub.

---

### Method 3: Drag-and-Drop on GitHub (Files only, not subfolders)

> **Note:** GitHub's web interface supports drag-and-drop of *individual files*, but **not entire folders with subfolders**. Use Method 1 or 2 for folders.

1. Open the repository on GitHub.
2. Navigate to the folder where you want to upload files.
3. Click **Add file** → **Upload files**.
4. Drag and drop your files (not the folder itself) or click *choose your files*.
5. Scroll down, add a commit message, and click **Commit changes**.

---

If you run into any issues, feel free to open an [issue](https://github.com/Piyush-singh2/OOPs_JAVA/issues).
