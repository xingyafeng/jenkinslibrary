
def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def cmd(messages) {

    sh "echo $messages"
}
