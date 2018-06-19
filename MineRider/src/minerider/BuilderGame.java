package minerider;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class BuilderGame {

      private String saveFile;
        private int width;
        private int height;
        private String type;
        private Probalities probabilities;
        private player player;
        private chimera chimera;
        private zombie zombie;

        public BuilderGame() {
        }

        public BuilderGame(String saveFile, int width, int heigth, String type, Probalities probabilities, player player, chimera chimera, zombie zombie) {
            this.saveFile = saveFile;
            this.width = width;
            this.height = height;
            this.type = type;
            this.probabilities = probabilities;
            this.player = player;
            this.chimera = chimera;
            this.zombie = zombie;
        }

        public String getSaveFile() {
            return saveFile;
        }

        public void setSaveFile(String saveFile) {
            this.saveFile = saveFile;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Probalities getProbabilities() {
            return probabilities;
        }

        public void setProbabilities(Probalities probabilities) {
            this.probabilities = probabilities;
        }

        public player getPlayer() {
            return player;
        }

        public void setPlayer(player player) {
            this.player = player;
        }

        public chimera getChimera() {
            return chimera;
        }

        public void setChimera(chimera chimera) {
            this.chimera = chimera;
        }

        public zombie getZombie() {
            return zombie;
        }

        public void setZombie(zombie zombie) {
            this.zombie = zombie;
        }

        @Override
        public String toString() {
            return "Juego{" + "saveFile=" + saveFile + ", width=" + width + ", height=" + height + ", type=" + type + ", probabilities=" + probabilities + ", player=" + player + ", chimera=" + chimera + ", zombie=" + zombie + '}';
        }

}
