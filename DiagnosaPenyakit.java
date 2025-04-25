# Definisi aturan diagnosa
def diagnosa_penyakit(gejala):
    if "daun menguning" in gejala and "bercak coklat" in gejala:
        return "Penyakit Hawar Daun"
    elif "daun menguning" in gejala and "pertumbuhan lambat" in gejala and "tanah kering" in gejala:
        return "Kekurangan Air"
    elif "daun menguning" in gejala and "bercak coklat" in gejala and "tanah asam" in gejala:
        return "Kekurangan Fosfor"
    elif "daun menguning" in gejala and "akar busuk" in gejala:
        return "Penyakit Busuk Akar"
    elif "daun menguning" in gejala and "serangan hama" in gejala:
        return "Serangan Hama"
    else:
        return "Diagnosa Tidak Diketahui"

# Fungsi utama
def main():
    print("Sistem Pakar Diagnosa Penyakit Tanaman Padi")
    gejala = []
    
    # Input gejala dari pengguna
    while True:
        gejala_input = input("Masukkan gejala (ketik 'selesai' untuk mengakhiri): ").lower()
        if gejala_input == 'selesai':
            break
        gejala.append(gejala_input)

    # Diagnosa penyakit berdasarkan gejala yang dimasukkan
    hasil_diagnosa = diagnosa_penyakit(gejala)
    print(f"Hasil Diagnosa: {hasil_diagnosa}")

# Menjalankan program
if __name__ == "__main__":
    main()